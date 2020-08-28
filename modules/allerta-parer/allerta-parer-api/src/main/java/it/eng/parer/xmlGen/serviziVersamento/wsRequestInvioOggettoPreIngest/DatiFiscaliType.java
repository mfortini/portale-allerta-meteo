//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.13 at 01:43:09 PM CET 
//


package it.eng.parer.xmlGen.serviziVersamento.wsRequestInvioOggettoPreIngest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DatiFiscaliType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiFiscaliType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Denominazione" type="{http://invioasync.xml.ws.sacerasi.eng.it/}StringMax254Type" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://invioasync.xml.ws.sacerasi.eng.it/}StringMax100Type" minOccurs="0"/>
 *         &lt;element name="Cognome" type="{http://invioasync.xml.ws.sacerasi.eng.it/}StringMax100Type" minOccurs="0"/>
 *         &lt;element name="CF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;length value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PIVA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;length value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataEmissione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NumeroProgressivo" type="{http://invioasync.xml.ws.sacerasi.eng.it/}PosIntMax12DgtType"/>
 *         &lt;element name="Registro" type="{http://invioasync.xml.ws.sacerasi.eng.it/}StringMax100Type"/>
 *         &lt;element name="PeriodoFiscale" type="{http://invioasync.xml.ws.sacerasi.eng.it/}StringMax100Type"/>
 *         &lt;element name="DataTermineEmissione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiFiscaliType", propOrder = {
    "denominazione",
    "nome",
    "cognome",
    "cf",
    "piva",
    "dataEmissione",
    "numeroProgressivo",
    "registro",
    "periodoFiscale",
    "dataTermineEmissione"
})
public class DatiFiscaliType {

    @XmlElement(name = "Denominazione")
    protected String denominazione;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "Cognome")
    protected String cognome;
    @XmlElement(name = "CF")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cf;
    @XmlElement(name = "PIVA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String piva;
    @XmlElement(name = "DataEmissione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissione;
    @XmlElement(name = "NumeroProgressivo")
    protected long numeroProgressivo;
    @XmlElement(name = "Registro", required = true)
    protected String registro;
    @XmlElement(name = "PeriodoFiscale", required = true)
    protected String periodoFiscale;
    @XmlElement(name = "DataTermineEmissione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataTermineEmissione;

    /**
     * Gets the value of the denominazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazione() {
        return denominazione;
    }

    /**
     * Sets the value of the denominazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazione(String value) {
        this.denominazione = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the cognome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Sets the value of the cognome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Gets the value of the cf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCF() {
        return cf;
    }

    /**
     * Sets the value of the cf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCF(String value) {
        this.cf = value;
    }

    /**
     * Gets the value of the piva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIVA() {
        return piva;
    }

    /**
     * Sets the value of the piva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIVA(String value) {
        this.piva = value;
    }

    /**
     * Gets the value of the dataEmissione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissione() {
        return dataEmissione;
    }

    /**
     * Sets the value of the dataEmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissione(XMLGregorianCalendar value) {
        this.dataEmissione = value;
    }

    /**
     * Gets the value of the numeroProgressivo property.
     * 
     */
    public long getNumeroProgressivo() {
        return numeroProgressivo;
    }

    /**
     * Sets the value of the numeroProgressivo property.
     * 
     */
    public void setNumeroProgressivo(long value) {
        this.numeroProgressivo = value;
    }

    /**
     * Gets the value of the registro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistro() {
        return registro;
    }

    /**
     * Sets the value of the registro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistro(String value) {
        this.registro = value;
    }

    /**
     * Gets the value of the periodoFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoFiscale() {
        return periodoFiscale;
    }

    /**
     * Sets the value of the periodoFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoFiscale(String value) {
        this.periodoFiscale = value;
    }

    /**
     * Gets the value of the dataTermineEmissione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTermineEmissione() {
        return dataTermineEmissione;
    }

    /**
     * Sets the value of the dataTermineEmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTermineEmissione(XMLGregorianCalendar value) {
        this.dataTermineEmissione = value;
    }

}