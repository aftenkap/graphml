package org.graphdrawing.graphml;

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



import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * Complex type for the <hyperedge> element.
 * 
 * 
 * <p>
 * Java class for hyperedge.type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="hyperedge.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}description" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://graphml.graphdrawing.org/xmlns}data"/>
 *           &lt;element ref="{http://graphml.graphdrawing.org/xmlns}endpoint"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}graph" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}hyperedge.extra.attrib"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hyperedge.type", propOrder = { "description", "keyData",
        "endpoints", "graph" })
public class Hyperedge
        implements IKeyDataContainer {

    @XmlElement(name = "desg")
    private String         description;

    @XmlElement(name = "data")
    private List<KeyData>  keyData;

    @XmlElement(name = "endpoint")
    private List<Endpoint> endpoints;

    @XmlElement(name = "graph")
    private Graph          graph;

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String         id;

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
     * Gets the value of the keyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the keyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getKeyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link KeyData }
     * 
     * 
     */
    @Override
    public List<KeyData> getKeyData() {

        if (keyData == null) {
            keyData = new ArrayList<KeyData>();
        }
        return this.keyData;
    }

    /**
     * Gets the value of the endpoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the endpoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getEndpoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Endpoint }
     * 
     * @return a {@link List} of {@link Endpoint Endpoints}.
     */
    public List<Endpoint> getEndpoints() {

        if (endpoints == null) {
            endpoints = new ArrayList<Endpoint>();
        }
        return this.endpoints;
    }

    /**
     * Gets the value of the graph property.
     * 
     * @return possible object is {@link Graph }
     * 
     */
    public Graph getGraph() {

        return graph;
    }

    /**
     * Sets the value of the graph property.
     * 
     * @param value
     *            allowed object is {@link Graph }
     * 
     */
    public void setGraph(Graph value) {

        this.graph = value;
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

}
