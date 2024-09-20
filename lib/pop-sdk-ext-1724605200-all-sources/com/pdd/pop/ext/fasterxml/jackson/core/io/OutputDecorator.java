package com.pdd.pop.ext.fasterxml.jackson.core.io;

import java.io.*;

/**
 * Handler class that can be used to decorate output destinations.
 * Typical use is to use a filter abstraction (filtered output stream,
 * writer) around original output destination, and apply additional
 * processing during write operations.
 */
@SuppressWarnings("serial")
public abstract class OutputDecorator implements java.io.Serializable // since 2.1
{
    /**
     * Method called by {@link com.pdd.pop.ext.fasterxml.jackson.core.JsonFactory} instance when
     * creating generator for given {@link OutputStream}, when this decorator
     * has been registered.
     * 
     * @param ctxt IO context in use (provides access to declared encoding)
     * @param out Original output destination
     * 
     * @return OutputStream to use; either passed in argument, or something that
     *   calls it
     */
    public abstract OutputStream decorate(IOContext ctxt, OutputStream out) throws IOException;

    /**
     * Method called by {@link com.pdd.pop.ext.fasterxml.jackson.core.JsonFactory} instance when
     * creating generator for given {@link Writer}, when this decorator
     * has been registered.
     * 
     * @param ctxt IO context in use (provides access to declared encoding)
     * @param w Original output writer
     * 
     * @return Writer to use; either passed in argument, or something that calls it
     */
    public abstract Writer decorate(IOContext ctxt, Writer w) throws IOException;
}
