//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2021.09.19 �s 02:10:34 PM BRT 
//


package br.com.viavarejo.reversa.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de retornoSobreWebService complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="retornoSobreWebService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cod_erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msg_erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="versao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataHomologacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataProducao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resumo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoSobreWebService", propOrder = {
    "data",
    "hora",
    "codErro",
    "msgErro",
    "versao",
    "dataHomologacao",
    "dataProducao",
    "fase",
    "resumo"
})
public class RetornoSobreWebService {

    protected String data;
    protected String hora;
    @XmlElement(name = "cod_erro")
    protected String codErro;
    @XmlElement(name = "msg_erro")
    protected String msgErro;
    protected String versao;
    protected String dataHomologacao;
    protected String dataProducao;
    protected String fase;
    protected String resumo;

    /**
     * Obt�m o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Obt�m o valor da propriedade hora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHora() {
        return hora;
    }

    /**
     * Define o valor da propriedade hora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHora(String value) {
        this.hora = value;
    }

    /**
     * Obt�m o valor da propriedade codErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodErro() {
        return codErro;
    }

    /**
     * Define o valor da propriedade codErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodErro(String value) {
        this.codErro = value;
    }

    /**
     * Obt�m o valor da propriedade msgErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgErro() {
        return msgErro;
    }

    /**
     * Define o valor da propriedade msgErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgErro(String value) {
        this.msgErro = value;
    }

    /**
     * Obt�m o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

    /**
     * Obt�m o valor da propriedade dataHomologacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataHomologacao() {
        return dataHomologacao;
    }

    /**
     * Define o valor da propriedade dataHomologacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataHomologacao(String value) {
        this.dataHomologacao = value;
    }

    /**
     * Obt�m o valor da propriedade dataProducao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProducao() {
        return dataProducao;
    }

    /**
     * Define o valor da propriedade dataProducao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProducao(String value) {
        this.dataProducao = value;
    }

    /**
     * Obt�m o valor da propriedade fase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFase() {
        return fase;
    }

    /**
     * Define o valor da propriedade fase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFase(String value) {
        this.fase = value;
    }

    /**
     * Obt�m o valor da propriedade resumo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumo() {
        return resumo;
    }

    /**
     * Define o valor da propriedade resumo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumo(String value) {
        this.resumo = value;
    }

}
