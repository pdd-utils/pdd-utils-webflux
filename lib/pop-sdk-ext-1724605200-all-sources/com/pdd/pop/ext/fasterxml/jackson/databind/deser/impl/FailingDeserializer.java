package com.pdd.pop.ext.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;

import com.pdd.pop.ext.fasterxml.jackson.core.JsonParser;
import com.pdd.pop.ext.fasterxml.jackson.databind.DeserializationContext;
import com.pdd.pop.ext.fasterxml.jackson.databind.JsonMappingException;
import com.pdd.pop.ext.fasterxml.jackson.databind.deser.std.StdDeserializer;

/**
 * Special bogus "serializer" that will throw
 * {@link JsonMappingException} if an attempt is made to deserialize
 * a value. This is used as placeholder to avoid NPEs for uninitialized
 * structured serializers or handlers.
 */
public class FailingDeserializer extends StdDeserializer<Object>
{
    private static final long serialVersionUID = 1L;

    protected final String _message;

    public FailingDeserializer(String m) {
        super(Object.class);
        _message = m;
    }
    
    @Override
    public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        ctxt.reportInputMismatch(this, _message);
        return null;
    }
}
