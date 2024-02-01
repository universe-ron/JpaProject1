package wuwu.challengejpa;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class ChallengeTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Integer id;
    @Column(name = "farmnm_ch")
    String farmnm_ch;
    @Column(name="tel")
    String tel;
    @Column(name="fax")
    String fax;
    @Column(name="pcode")
    String pcode;
    @Column(name="county")
    String county;
    @Column(name="township")
    String township;
    @Column(name="address_ch")
    String address_ch;
    @Column(name="address_en")
    String address_en;
    @Column(name="weburl")
    String weburl;
    @Column(name="longitude")
    String longitude;
    @Column(name="latitude")
    String latitude;
    @Column(name="serveitem")
    String serveitem;
    @Column(name="facebook")
    String facebook;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFarmnm_ch() {
        return farmnm_ch;
    }

    public void setFarmnm_ch(String farmnm_ch) {
        this.farmnm_ch = farmnm_ch;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public String getAddress_ch() {
        return address_ch;
    }

    public void setAddress_ch(String address_ch) {
        this.address_ch = address_ch;
    }

    public String getAddress_en() {
        return address_en;
    }

    public void setAddress_en(String address_en) {
        this.address_en = address_en;
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getServeitem() {
        return serveitem;
    }

    public void setServeitem(String serveitem) {
        this.serveitem = serveitem;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
}
