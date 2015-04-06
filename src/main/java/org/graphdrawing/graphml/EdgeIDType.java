package org.graphdrawing.graphml;

//@formatter:off
/*
* #%L
 * * GraphML library
 * *
 * %%
 * Copyright (C) 2011 - 2014 jutility.org
 * *
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
 * Java class for graph.edgeids.type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * 
 * <pre>
 * &lt;simpleType name="graph.edgeids.type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="canonical"/&gt;
 *     &lt;enumeration value="free"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlType(name = "graph.edgeids.type")
@XmlEnum
public enum EdgeIDType {

    /**
     * Canonical ids.
     */
    @XmlEnumValue("canonical")
    CANONICAL("canonical"),
    /**
     * Free ids.
     */
    @XmlEnumValue("free")
    FREE("free");

    private final String value;

    private EdgeIDType(String v) {

        value = v;
    }

    /**
     * Returns the value.
     * 
     * @return the value.
     */
    public String value() {

        return value;
    }

    /**
     * Returns the {@link EdgeIDType} corresponding to the provided value.
     * 
     * @param value
     *            the value.
     * @return the {@link EdgeIDType} corresponding to the provided value.
     */
    public static EdgeIDType fromValue(String value) {

        for (EdgeIDType constant : EdgeIDType.values()) {
            if (constant.value.equals(value)) {
                return constant;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
