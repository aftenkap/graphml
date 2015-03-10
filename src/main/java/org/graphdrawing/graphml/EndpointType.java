package org.graphdrawing.graphml;

//@formatter:off
/*
* #%L
* GraphML library
* %%
* Copyright (C) 2011 - 2014 jutility.org
* %%
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*      http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* #L%
*/
//@formatter:on



import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for endpoint.type.type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;simpleType name="endpoint.type.type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="in"/&gt;
 *     &lt;enumeration value="out"/&gt;
 *     &lt;enumeration value="undir"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlType(name = "endpoint.type.type")
@XmlEnum
public enum EndpointType {

    /**
     * Connecting inbound edge.
     */
    @XmlEnumValue("in")
    IN("in"),
    /**
     * Connecting outbound edge.
     */
    @XmlEnumValue("out")
    OUT("out"),
    /**
     * Connecting undirected edge.
     */
    @XmlEnumValue("undir")
    UNDIRECTED("undir");

    private final String value;

    /**
     * Creates a new instance of the {@link EndpointType} class with the
     * provided value.
     * 
     * @param value
     *            the value.
     */
    private EndpointType(String value) {

        this.value = value;
    }

    /**
     * Returns the value.
     * 
     * @return the value.
     */
    public String value() {

        return this.value;
    }

    /**
     * Returns the {@link EndpointType} corresponding to the provided value.
     * 
     * @param value
     *            the value.
     * @return the {@link EndpointType} corresponding to the provided value.
     */
    public static EndpointType fromValue(String value) {

        for (EndpointType constant : EndpointType.values()) {

            if (constant.value.equals(value)) {

                return constant;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
