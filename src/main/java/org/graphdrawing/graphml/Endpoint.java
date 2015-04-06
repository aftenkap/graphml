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



import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * Complex type for the {@code <endpoint>} element.
 * 
 * 
 * <p>
 * Java class for endpoint.type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="endpoint.type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}endpoint.extra.attrib"/&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="portID" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="nodeID" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="type" type="{http://graphml.graphdrawing.org/xmlns}endpoint.type.type" default="undir" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endpoint.type", propOrder = { "description" })
public class Endpoint {

    @XmlElement(name = "desc")
    private String       description;

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String       id;

    @XmlAttribute(name = "port")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String       portID;

    @XmlAttribute(name = "node", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String       nodeID;

    @XmlAttribute(name = "type")
    private EndpointType type;

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDescription() {

        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDescription(String value) {

        this.description = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {

        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setId(String value) {

        this.id = value;
    }

    /**
     * Gets the value of the portID property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPortID() {

        return portID;
    }

    /**
     * Sets the value of the portID property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPortID(String value) {

        this.portID = value;
    }

    /**
     * Gets the value of the nodeID property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNodeID() {

        return nodeID;
    }

    /**
     * Sets the value of the nodeID property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setNodeID(String value) {

        this.nodeID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return possible object is {@link EndpointType }
     * 
     */
    public EndpointType getType() {

        if (type == null) {
            return EndpointType.UNDIRECTED;
        }
        else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *            allowed object is {@link EndpointType }
     * 
     */
    public void setType(EndpointType value) {

        this.type = value;
    }

}
