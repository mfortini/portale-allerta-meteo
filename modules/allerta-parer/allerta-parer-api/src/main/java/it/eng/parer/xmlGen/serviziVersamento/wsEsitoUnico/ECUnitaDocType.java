//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.13 at 01:46:09 PM CET 
//


package it.eng.parer.xmlGen.serviziVersamento.wsEsitoUnico;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ECUnitaDocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECUnitaDocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Versatore" type="{}SCVersatoreType" minOccurs="0"/>
 *         &lt;element name="Chiave" type="{}SCChiaveType" minOccurs="0"/>
 *         &lt;element name="DataVersamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StatoConservazione" type="{}ECStatoConsType" minOccurs="0"/>
 *         &lt;element name="FirmatoDigitalmente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EsitoUnitaDocumentaria" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CodiceEsito" type="{}ECEsitoPosNegWarType" minOccurs="0"/>
 *                   &lt;element name="IdentificazioneVersatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UnivocitaChiave" type="{}ECEsitoPosNegType" minOccurs="0"/>
 *                   &lt;element name="VerificaTipologiaUD" type="{}ECEsitoPosNegType" minOccurs="0"/>
 *                   &lt;element name="CorrispondenzaDatiSpecifici" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PresenzaUDCollegate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="VerificaFirmeUnitaDocumentaria" type="{}ECEsitoPosNegWarType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DocumentoPrincipale" type="{}ECDocumentoType" minOccurs="0"/>
 *         &lt;element name="Allegati" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Allegato" type="{}ECDocumentoType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Annessi" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Annesso" type="{}ECDocumentoType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Annotazioni" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Annotazione" type="{}ECDocumentoType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECUnitaDocType", propOrder = {
    "versatore",
    "chiave",
    "dataVersamento",
    "statoConservazione",
    "firmatoDigitalmente",
    "esitoUnitaDocumentaria",
    "documentoPrincipale",
    "allegati",
    "annessi",
    "annotazioni"
})
public class ECUnitaDocType {

    @XmlElement(name = "Versatore")
    protected SCVersatoreType versatore;
    @XmlElement(name = "Chiave")
    protected SCChiaveType chiave;
    @XmlElement(name = "DataVersamento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVersamento;
    @XmlElement(name = "StatoConservazione")
    protected ECStatoConsType statoConservazione;
    @XmlElement(name = "FirmatoDigitalmente")
    protected Boolean firmatoDigitalmente;
    @XmlElement(name = "EsitoUnitaDocumentaria")
    protected ECUnitaDocType.EsitoUnitaDocumentaria esitoUnitaDocumentaria;
    @XmlElement(name = "DocumentoPrincipale")
    protected ECDocumentoType documentoPrincipale;
    @XmlElement(name = "Allegati")
    protected ECUnitaDocType.Allegati allegati;
    @XmlElement(name = "Annessi")
    protected ECUnitaDocType.Annessi annessi;
    @XmlElement(name = "Annotazioni")
    protected ECUnitaDocType.Annotazioni annotazioni;

    /**
     * Gets the value of the versatore property.
     * 
     * @return
     *     possible object is
     *     {@link SCVersatoreType }
     *     
     */
    public SCVersatoreType getVersatore() {
        return versatore;
    }

    /**
     * Sets the value of the versatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCVersatoreType }
     *     
     */
    public void setVersatore(SCVersatoreType value) {
        this.versatore = value;
    }

    /**
     * Gets the value of the chiave property.
     * 
     * @return
     *     possible object is
     *     {@link SCChiaveType }
     *     
     */
    public SCChiaveType getChiave() {
        return chiave;
    }

    /**
     * Sets the value of the chiave property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCChiaveType }
     *     
     */
    public void setChiave(SCChiaveType value) {
        this.chiave = value;
    }

    /**
     * Gets the value of the dataVersamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVersamento() {
        return dataVersamento;
    }

    /**
     * Sets the value of the dataVersamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVersamento(XMLGregorianCalendar value) {
        this.dataVersamento = value;
    }

    /**
     * Gets the value of the statoConservazione property.
     * 
     * @return
     *     possible object is
     *     {@link ECStatoConsType }
     *     
     */
    public ECStatoConsType getStatoConservazione() {
        return statoConservazione;
    }

    /**
     * Sets the value of the statoConservazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECStatoConsType }
     *     
     */
    public void setStatoConservazione(ECStatoConsType value) {
        this.statoConservazione = value;
    }

    /**
     * Gets the value of the firmatoDigitalmente property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirmatoDigitalmente() {
        return firmatoDigitalmente;
    }

    /**
     * Sets the value of the firmatoDigitalmente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirmatoDigitalmente(Boolean value) {
        this.firmatoDigitalmente = value;
    }

    /**
     * Gets the value of the esitoUnitaDocumentaria property.
     * 
     * @return
     *     possible object is
     *     {@link ECUnitaDocType.EsitoUnitaDocumentaria }
     *     
     */
    public ECUnitaDocType.EsitoUnitaDocumentaria getEsitoUnitaDocumentaria() {
        return esitoUnitaDocumentaria;
    }

    /**
     * Sets the value of the esitoUnitaDocumentaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECUnitaDocType.EsitoUnitaDocumentaria }
     *     
     */
    public void setEsitoUnitaDocumentaria(ECUnitaDocType.EsitoUnitaDocumentaria value) {
        this.esitoUnitaDocumentaria = value;
    }

    /**
     * Gets the value of the documentoPrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link ECDocumentoType }
     *     
     */
    public ECDocumentoType getDocumentoPrincipale() {
        return documentoPrincipale;
    }

    /**
     * Sets the value of the documentoPrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECDocumentoType }
     *     
     */
    public void setDocumentoPrincipale(ECDocumentoType value) {
        this.documentoPrincipale = value;
    }

    /**
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link ECUnitaDocType.Allegati }
     *     
     */
    public ECUnitaDocType.Allegati getAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECUnitaDocType.Allegati }
     *     
     */
    public void setAllegati(ECUnitaDocType.Allegati value) {
        this.allegati = value;
    }

    /**
     * Gets the value of the annessi property.
     * 
     * @return
     *     possible object is
     *     {@link ECUnitaDocType.Annessi }
     *     
     */
    public ECUnitaDocType.Annessi getAnnessi() {
        return annessi;
    }

    /**
     * Sets the value of the annessi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECUnitaDocType.Annessi }
     *     
     */
    public void setAnnessi(ECUnitaDocType.Annessi value) {
        this.annessi = value;
    }

    /**
     * Gets the value of the annotazioni property.
     * 
     * @return
     *     possible object is
     *     {@link ECUnitaDocType.Annotazioni }
     *     
     */
    public ECUnitaDocType.Annotazioni getAnnotazioni() {
        return annotazioni;
    }

    /**
     * Sets the value of the annotazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECUnitaDocType.Annotazioni }
     *     
     */
    public void setAnnotazioni(ECUnitaDocType.Annotazioni value) {
        this.annotazioni = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Allegato" type="{}ECDocumentoType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allegato"
    })
    public static class Allegati {

        @XmlElement(name = "Allegato", required = true)
        protected List<ECDocumentoType> allegato;

        /**
         * Gets the value of the allegato property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allegato property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllegato().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECDocumentoType }
         * 
         * 
         */
        public List<ECDocumentoType> getAllegato() {
            if (allegato == null) {
                allegato = new ArrayList<ECDocumentoType>();
            }
            return this.allegato;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Annesso" type="{}ECDocumentoType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "annesso"
    })
    public static class Annessi {

        @XmlElement(name = "Annesso", required = true)
        protected List<ECDocumentoType> annesso;

        /**
         * Gets the value of the annesso property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the annesso property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnnesso().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECDocumentoType }
         * 
         * 
         */
        public List<ECDocumentoType> getAnnesso() {
            if (annesso == null) {
                annesso = new ArrayList<ECDocumentoType>();
            }
            return this.annesso;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Annotazione" type="{}ECDocumentoType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "annotazione"
    })
    public static class Annotazioni {

        @XmlElement(name = "Annotazione", required = true)
        protected List<ECDocumentoType> annotazione;

        /**
         * Gets the value of the annotazione property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the annotazione property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnnotazione().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECDocumentoType }
         * 
         * 
         */
        public List<ECDocumentoType> getAnnotazione() {
            if (annotazione == null) {
                annotazione = new ArrayList<ECDocumentoType>();
            }
            return this.annotazione;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CodiceEsito" type="{}ECEsitoPosNegWarType" minOccurs="0"/>
     *         &lt;element name="IdentificazioneVersatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UnivocitaChiave" type="{}ECEsitoPosNegType" minOccurs="0"/>
     *         &lt;element name="VerificaTipologiaUD" type="{}ECEsitoPosNegType" minOccurs="0"/>
     *         &lt;element name="CorrispondenzaDatiSpecifici" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PresenzaUDCollegate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VerificaFirmeUnitaDocumentaria" type="{}ECEsitoPosNegWarType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codiceEsito",
        "identificazioneVersatore",
        "univocitaChiave",
        "verificaTipologiaUD",
        "corrispondenzaDatiSpecifici",
        "presenzaUDCollegate",
        "verificaFirmeUnitaDocumentaria"
    })
    public static class EsitoUnitaDocumentaria {

        @XmlElement(name = "CodiceEsito")
        protected ECEsitoPosNegWarType codiceEsito;
        @XmlElement(name = "IdentificazioneVersatore")
        protected String identificazioneVersatore;
        @XmlElement(name = "UnivocitaChiave")
        protected ECEsitoPosNegType univocitaChiave;
        @XmlElement(name = "VerificaTipologiaUD")
        protected ECEsitoPosNegType verificaTipologiaUD;
        @XmlElement(name = "CorrispondenzaDatiSpecifici")
        protected String corrispondenzaDatiSpecifici;
        @XmlElement(name = "PresenzaUDCollegate")
        protected String presenzaUDCollegate;
        @XmlElement(name = "VerificaFirmeUnitaDocumentaria")
        protected ECEsitoPosNegWarType verificaFirmeUnitaDocumentaria;

        /**
         * Gets the value of the codiceEsito property.
         * 
         * @return
         *     possible object is
         *     {@link ECEsitoPosNegWarType }
         *     
         */
        public ECEsitoPosNegWarType getCodiceEsito() {
            return codiceEsito;
        }

        /**
         * Sets the value of the codiceEsito property.
         * 
         * @param value
         *     allowed object is
         *     {@link ECEsitoPosNegWarType }
         *     
         */
        public void setCodiceEsito(ECEsitoPosNegWarType value) {
            this.codiceEsito = value;
        }

        /**
         * Gets the value of the identificazioneVersatore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentificazioneVersatore() {
            return identificazioneVersatore;
        }

        /**
         * Sets the value of the identificazioneVersatore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentificazioneVersatore(String value) {
            this.identificazioneVersatore = value;
        }

        /**
         * Gets the value of the univocitaChiave property.
         * 
         * @return
         *     possible object is
         *     {@link ECEsitoPosNegType }
         *     
         */
        public ECEsitoPosNegType getUnivocitaChiave() {
            return univocitaChiave;
        }

        /**
         * Sets the value of the univocitaChiave property.
         * 
         * @param value
         *     allowed object is
         *     {@link ECEsitoPosNegType }
         *     
         */
        public void setUnivocitaChiave(ECEsitoPosNegType value) {
            this.univocitaChiave = value;
        }

        /**
         * Gets the value of the verificaTipologiaUD property.
         * 
         * @return
         *     possible object is
         *     {@link ECEsitoPosNegType }
         *     
         */
        public ECEsitoPosNegType getVerificaTipologiaUD() {
            return verificaTipologiaUD;
        }

        /**
         * Sets the value of the verificaTipologiaUD property.
         * 
         * @param value
         *     allowed object is
         *     {@link ECEsitoPosNegType }
         *     
         */
        public void setVerificaTipologiaUD(ECEsitoPosNegType value) {
            this.verificaTipologiaUD = value;
        }

        /**
         * Gets the value of the corrispondenzaDatiSpecifici property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorrispondenzaDatiSpecifici() {
            return corrispondenzaDatiSpecifici;
        }

        /**
         * Sets the value of the corrispondenzaDatiSpecifici property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorrispondenzaDatiSpecifici(String value) {
            this.corrispondenzaDatiSpecifici = value;
        }

        /**
         * Gets the value of the presenzaUDCollegate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPresenzaUDCollegate() {
            return presenzaUDCollegate;
        }

        /**
         * Sets the value of the presenzaUDCollegate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPresenzaUDCollegate(String value) {
            this.presenzaUDCollegate = value;
        }

        /**
         * Gets the value of the verificaFirmeUnitaDocumentaria property.
         * 
         * @return
         *     possible object is
         *     {@link ECEsitoPosNegWarType }
         *     
         */
        public ECEsitoPosNegWarType getVerificaFirmeUnitaDocumentaria() {
            return verificaFirmeUnitaDocumentaria;
        }

        /**
         * Sets the value of the verificaFirmeUnitaDocumentaria property.
         * 
         * @param value
         *     allowed object is
         *     {@link ECEsitoPosNegWarType }
         *     
         */
        public void setVerificaFirmeUnitaDocumentaria(ECEsitoPosNegWarType value) {
            this.verificaFirmeUnitaDocumentaria = value;
        }

    }

}
