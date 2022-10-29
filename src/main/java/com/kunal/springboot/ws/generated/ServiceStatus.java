package com.kunal.springboot.ws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Kumar.Kunal
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceStatus", propOrder = {
        "code",
        "description"
})
public class ServiceStatus {
	
	private String code;
    private String description;

    public ServiceStatus() {
    }

    public ServiceStatus(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
