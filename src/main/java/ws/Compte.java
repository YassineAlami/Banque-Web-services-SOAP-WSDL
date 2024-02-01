package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

//Meni tancreer had lobj "Compte" meni nconvertih l xml.. y3tini wa7ed l'element xml qui s'appelle "compte"
@XmlRootElement(name = "compte")
//@XmlAccessorType bach n9der nsta3mel les annotations b7al @XmlTransient
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte
{
    private int code;
    private double solde;

    //@XmlTransient est une annotation de jaxB.. kangoulo lJaxb menni tconverti had lobj en xml ne9ez had latt matconvertihch
    @XmlTransient
    private Date dateCreation;

    public Compte() {
    }

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
