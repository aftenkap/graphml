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



import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * Complex type for the {@code <edge>} element.
 * 
 * 
 * <p>
 * Java class for edge.type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="edge.type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}keyData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}graph" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}edge.extra.attrib"/&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="isDirected" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="sourceport" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="targetport" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
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
@XmlType(name = "edge.type", propOrder = { "description", "keyData", "graph" })
public class Edge
        implements IKeyDataContainer {

    @XmlElement(name = "desc")
    private String        description;

    @XmlElement(name = "data")
    private List<KeyData> keyData;

    @XmlElement(name = "graph")
    private Graph         graph;

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String        id;

    @XmlAttribute(name = "directed")
    private Boolean       isDirected;

    @XmlAttribute(name = "source", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String        source;

    @XmlAttribute(name = "target", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String        target;

    @XmlAttribute(name = "sourceport")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String        sourceport;

    @XmlAttribute(name = "targetport")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String        targetport;

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
     * getData().add(newItem);
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

    /**
     * Gets the value of the isDirected property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isDirected() {

        return isDirected;
    }

    /**
     * Sets the value of the isDirected property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setDirected(Boolean value) {

        this.isDirected = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSource() {

        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSource(String value) {

        this.source = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTarget() {

        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTarget(String value) {

        this.target = value;
    }

    /**
     * Gets the value of the sourceport property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSourceport() {

        return sourceport;
    }

    /**
     * Sets the value of the sourceport property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSourceport(String value) {

        this.sourceport = value;
    }

    /**
     * Gets the value of the targetport property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTargetport() {

        return targetport;
    }

    /**
     * Sets the value of the targetport property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTargetport(String value) {

        this.targetport = value;
    }
}
