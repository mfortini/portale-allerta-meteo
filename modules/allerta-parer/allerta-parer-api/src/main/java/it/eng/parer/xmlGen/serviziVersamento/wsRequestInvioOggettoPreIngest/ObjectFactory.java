//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.13 at 01:43:09 PM CET 
//


package it.eng.parer.xmlGen.serviziVersamento.wsRequestInvioOggettoPreIngest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.eng.javaClass package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListaUnitaDocumentarie_QNAME = new QName("http://invioasync.xml.ws.sacerasi.eng.it/", "ListaUnitaDocumentarie");
    private final static QName _FileTypeDatiSpecifici_QNAME = new QName("", "DatiSpecifici");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.eng.javaClass
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaUnitaDocumentarieType }
     * 
     */
    public ListaUnitaDocumentarieType createListaUnitaDocumentarieType() {
        return new ListaUnitaDocumentarieType();
    }

    /**
     * Create an instance of {@link DocumentoCollegatoType.DocumentoCollegato }
     * 
     */
    public DocumentoCollegatoType.DocumentoCollegato createDocumentoCollegatoTypeDocumentoCollegato() {
        return new DocumentoCollegatoType.DocumentoCollegato();
    }

    /**
     * Create an instance of {@link DocumentoCollegatoType }
     * 
     */
    public DocumentoCollegatoType createDocumentoCollegatoType() {
        return new DocumentoCollegatoType();
    }

    /**
     * Create an instance of {@link UnitaDocumentariaType }
     * 
     */
    public UnitaDocumentariaType createUnitaDocumentariaType() {
        return new UnitaDocumentariaType();
    }

    /**
     * Create an instance of {@link DatiSpecificiType }
     * 
     */
    public DatiSpecificiType createDatiSpecificiType() {
        return new DatiSpecificiType();
    }

    /**
     * Create an instance of {@link DatiFiscaliType }
     * 
     */
    public DatiFiscaliType createDatiFiscaliType() {
        return new DatiFiscaliType();
    }

    /**
     * Create an instance of {@link ProfiloUnitaDocumentariaType }
     * 
     */
    public ProfiloUnitaDocumentariaType createProfiloUnitaDocumentariaType() {
        return new ProfiloUnitaDocumentariaType();
    }

    /**
     * Create an instance of {@link UnitaDocumentariaType.Files }
     * 
     */
    public UnitaDocumentariaType.Files createUnitaDocumentariaTypeFiles() {
        return new UnitaDocumentariaType.Files();
    }

    /**
     * Create an instance of {@link ChiaveType }
     * 
     */
    public ChiaveType createChiaveType() {
        return new ChiaveType();
    }

    /**
     * Create an instance of {@link CamiciaFascicoloType }
     * 
     */
    public CamiciaFascicoloType createCamiciaFascicoloType() {
        return new CamiciaFascicoloType();
    }

    /**
     * Create an instance of {@link ProfiloDocumentoType }
     * 
     */
    public ProfiloDocumentoType createProfiloDocumentoType() {
        return new ProfiloDocumentoType();
    }

    /**
     * Create an instance of {@link FileType }
     * 
     */
    public FileType createFileType() {
        return new FileType();
    }

    /**
     * Create an instance of {@link ProfiloArchivisticoType.FascicoliSecondari }
     * 
     */
    public ProfiloArchivisticoType.FascicoliSecondari createProfiloArchivisticoTypeFascicoliSecondari() {
        return new ProfiloArchivisticoType.FascicoliSecondari();
    }

    /**
     * Create an instance of {@link FascicoloType }
     * 
     */
    public FascicoloType createFascicoloType() {
        return new FascicoloType();
    }

    /**
     * Create an instance of {@link ProfiloArchivisticoType }
     * 
     */
    public ProfiloArchivisticoType createProfiloArchivisticoType() {
        return new ProfiloArchivisticoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaUnitaDocumentarieType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://invioasync.xml.ws.sacerasi.eng.it/", name = "ListaUnitaDocumentarie")
    public JAXBElement<ListaUnitaDocumentarieType> createListaUnitaDocumentarie(ListaUnitaDocumentarieType value) {
        return new JAXBElement<ListaUnitaDocumentarieType>(_ListaUnitaDocumentarie_QNAME, ListaUnitaDocumentarieType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiSpecificiType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DatiSpecifici", scope = FileType.class)
    public JAXBElement<DatiSpecificiType> createFileTypeDatiSpecifici(DatiSpecificiType value) {
        return new JAXBElement<DatiSpecificiType>(_FileTypeDatiSpecifici_QNAME, DatiSpecificiType.class, FileType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiSpecificiType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DatiSpecifici", scope = UnitaDocumentariaType.class)
    public JAXBElement<DatiSpecificiType> createUnitaDocumentariaTypeDatiSpecifici(DatiSpecificiType value) {
        return new JAXBElement<DatiSpecificiType>(_FileTypeDatiSpecifici_QNAME, DatiSpecificiType.class, UnitaDocumentariaType.class, value);
    }

}
