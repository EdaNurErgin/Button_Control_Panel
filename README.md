# Button_Control_Panel
 Button Control Panel
Button Kontrol Paneli Uygulaması

Projenin Amacı Nedir?

1.4x4 matris oluşturarak buradaki hücrelerin her birine buton eklemek .

2.Butonların aktif olması durumlarını incelemek.

3.Butonların pasif olması durumlarını incelemek.

4.Kullanıcının 1. Kez butona bastığında programın doğru tepkiler vermesini sağlamak.(Butonun aktif simge ve aktif renk almasını sağlamak.)

5.Kullanıcının 2.kez  butona bastığında programın doğru tepkiler vermesini sağlamak.(Butonun pasif renk ve pasif simge almasını sağlamak.Aynıanda iki butonun aktif olmamasını sağlamak.)


Projeyi Anlamak İçin Bilmemiz Gerekenler 

GraphQL, bir veri sorgulama dilidir ve modern API'ler için bir sunucu tarafı bir teknolojisidir.
GraphQL üç temel unsurdan oluşur:

1.Sorgu (Query): İstemcinin istediği verileri almak için kullanılır. İstemci, sadece istediği alanları belirtir ve yalnızca bu alanları alır.

2.Mutasyon (Mutation): Sunucuda değişiklik yapmak için kullanılır. Veritabanında ekleme, güncelleme, silme gibi işlemleri gerçekleştirir.

3.Abonelik (Subscription): Belirli bir olay gerçekleştiğinde sunucudan gerçek zamanlı olarak veri almak için kullanılır


Projemizde GraphQL ‘yi nasıl kullandık?

Her buton bir GraphQL bilgisini temsil ediyor.Kullanıcı her butona bastığında aslında belirli bir mutasyonu çalıştırmış oluyorbunun sonucunda da butonun bağlı olduğu GraphQL bilgisi ekrana yazdırılıyor.
Peki; bu ne işe yarar, diye düşünecek olursak şu cevabı verebiliriz:Her buton bir bilgi içerseydi biz bir butona bastığımızda , bastığımız butonun özelliği yani bilgisi aktifleşecekti .
Her buton OzelButton sınıfı tarafından temsil edilir ve her butonun özel GraphQL bilgisi vardır.Bu bilgiler graphQLBilgi adlı alanda saklanır.
Bir butona tıklandığında ButtonKontrolBolgesi sınıfı tarafından bu tıklama işlenir. actionPerformed metodunda, tıklanan butonun graphQL bilgisi alınarak yazdırılır.Ayrıca bu butona bağlı GraphQL mutasyonu da çalıştırılır.Daha basit anlatacak olursak şunu söyleyebiliriz:Butona tıklanır;belirli bir veri üzerinde değişiklik yapabiliriz veya istediğimiz bir şeyi gerçekleştirebiliriz.
GraphqlMutasyonu adlı metot kullanıcı her butona bastığında çağrılır ve bu metod, ilgili butonun bağlı olduğu GraphQL bilgisini kullanarak belirli bir mutasyonu çalıştırmak için ayarlayabiliriz.

Projeyi Nasıl Çalıştırırız ?
1.	Java Kurulumu.
2.	Terminale “javac ButtonKontrolBolgesi.java “ yazın ve derlemiş olun.
3.	Terminale “java ButtonKontrolBolgesi” komutunu yazarak projeyi başlatmış olun.


Kodun İçeriği Hakkında Bilgiler

-Java Swing: Grafiksel kullanıcı arayüzü oluşturmak için Swing kütüphanesi kullanılmıştır.

-Buton Kontrolü: Her bir buton, tıklama olaylarına bağlı olarak rengini/simgesini değiştirir ve özel işlevler çalıştırır.

-GraphQL Mutasyonları: Butona tıklama, bir mutasyonu tetikler ve ilgili butonun bağlı olduğu GraphQL bilgisini gösterir.

-ButtonKontrolBolgesi  ve OzelButton adlı iki sınıf içerir.

-ButtonKontrolBolgesi,ana sınıf olarak işlev görür.4x4’lük butonlar bu sınıfta oluşturulur.

-OzelButton sınıfı , Özel JButton sınıfını temsil eder. Her bir butonun özel GraphQL bilgisini saklar.



Proje Nasıl Test Edilir?

1.Kodu çalıştırdığımda bütün butonların pasif olmalı yani butonların renkleri mavi olmalı.

2.Kodu çalıştırdığımda bütün butonların üzerinde soru işareti simgesi olmalı.

3.Kodu çalıştırdığımda ve bir butona tıkladığımda ;  soru işareti simgesi kalkmalı,butonun rengi pembe olmalı ve butonun simgesi ünlem olmalı.

4.Her butona bastığımda , butonun konum bilgisi hakkında çıktı almalıyım.

5.Kodu çalıştırdığımda ; 2.kez butona bastığımda diğer butonlar pasif hale gelmeli ve 2.bastığım buton aktif olmalı.


Hazırlayan:Eda Nur Ergin-1220505032

