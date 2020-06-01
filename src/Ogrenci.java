public class Ogrenci /* Ogrenci adında public bir sınıf oluşturuldu. */ {

    private final String isim; /* isim soyisim değişkenleriyle özel string bir ifade oluşturuldu */
    private final String soyisim; /* isim soyisim değişkenleriyle özel string bir ifade oluşturuldu */
private final int No; /* No değişkeniyle özel int bir ifade oluşturuldu.  */
public Ogrenci(String isim, String soyisim, int No) /* oluşturulan değişkenler public metoduyla girildi. */ {
this.isim=isim; /* this metoduyla isim değişkenini çektik */
this.soyisim=soyisim; /* this metoduyla soyisim değişkenini çektik */
this.No=No; /* this metoduyla No değişkenini çektik */
}
public String getisim() { /* getter metoduyla isim değişkenini aldık */
return this.isim; /* return metoduyla isim değişkenine döndük */
}
public String getsoyisim(){ /* getter metoduyla soyisim değişkenini aldık */

return this.soyisim; /* return metoduyla soyisim değişkenine döndük */
}
public int getNo(){ /* getter metoduyla no değişkenini aldık */

return this.No; /* return metoduyla no değişkenine döndük */
}
}
