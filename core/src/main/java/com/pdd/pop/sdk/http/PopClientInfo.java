package com.pdd.pop.sdk.http;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PopClientInfo {
    private String pddClientPlatform;
    private String pddClientIp;
    private String pddClientUserAgent;
    private String pddId;
}
