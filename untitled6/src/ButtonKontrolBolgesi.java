import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonKontrolBolgesi extends JFrame implements ActionListener {
    //butonkontrolbolgesi sinifi JFrame'yi miras alir ve ActionListener arayuzunu kullanir
    private JButton[][] buttons; // Butonlar için matris tanimladik satir ve sutun sayilari icin
   // private String graphqlAddress = "https://example.com/graphql"; // GraphQL adresi (örnek)

    private Color aktifRenk = Color.PINK; // butona tikladigimizdaki renk
    private Color pasifRenk = Color.BLUE; // butona basmadigimizdaki renk



    Icon aktifSimge = UIManager.getIcon("OptionPane.warningIcon");//buton aktifken karsimiza  cikacak sembol
    Icon pasifSimge = UIManager.getIcon("OptionPane.questionIcon");//buton pasifken karsimiza  cikacak sembol

    public ButtonKontrolBolgesi() {
        super("Button Kontrol Bolgesi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame penceresi kapatıldığında ne olacağını belirtir
        setSize(400, 400);//pencere boyutunu ayarladik

        // 4satir ve 4 sutundan olusan butonlarimizi olusturuyoruz
        buttons = new JButton[4][4]; //4 satır ve 4 sütundan oluşan bir JButton matrisi oluşturur.
        setLayout(new GridLayout(4, 4));//GridLayout 4x4 lük bir izgara düzeni olusturur

        // Buton matrisini oluşturuyoruz ve özelliklerini ayarlıyoruz
        for (int i = 0; i < 4; i++) {//satirları olusturuyoruz
            for (int j = 0; j < 4; j++) {//sutunlari olusturuyoruz
                buttons[i][j] = new OzelButton("", "Bilgi " + (i + 1) + "-" + (j + 1)); // Örnek bir GraphQL bilgisi
                buttons[i][j].setBackground(pasifRenk);//ilgili hucredeki butonun rengini ayarladik
                buttons[i][j].setIcon(pasifSimge);//ilgili hucredeki butonun simgesini ayarladik
                buttons[i][j].addActionListener(this);
                // herhangi bir butona tıklandığında, ButtonKontrolBolgesi sınıfının actionPerformed metodunu çalıştırır.
                buttons[i][j].setActionCommand(i + "-" + j); // Butonun konumunu belirlemek için yaptik
                add(buttons[i][j]);//ilgili hücreli butonu ekler
            }
        }

        setVisible(true);//pencerenin ekranda belirgin bir şekilde görünür olmasını sağlar ve kullanıcıya pencere içeriğini gösterir.
    }

    @Override
    public void actionPerformed(ActionEvent e) {// Bu metod buton tıklamalarını yakalamak icin ve belirli işlemleri gerçekleştirmek için kullaniriz

        OzelButton tiklanmisButon = (OzelButton) e.getSource();//e.getSource ile alinan referansi OzelButton sinifindan turetilmis bir degiskene atar
        String[] command = e.getActionCommand().split("-");//bu butonun satır ve sutun pozisyonunu belirler
        int row = Integer.parseInt(command[0]);//parcalanan  degerleri int veritipine donusturur
        int col = Integer.parseInt(command[1]);////parcalanan  degerleri int veritipine donusturur

        // Tüm butonların rengini ve simgesini pasif yaptik
        butunButonlarPasifken();

        // Butonu aktif yaptik
        buttons[row][col].setBackground(aktifRenk);
        buttons[row][col].setIcon(aktifSimge);

        // Burada GraphQL mutasyonunu çalıştırabilirsiniz
        GraphqlMutasyonu(row, col);//GraphqlMutasyonu cagirdik
        String graphqlBilgi = tiklanmisButon.getGraphqlBilgi();//tiklanmis butonun matrisini alip bu bilgiyi graphqlBilgi degiskenine atadik
        System.out.println("GraphQL Bilgisi: " + graphqlBilgi);//butona ilişkin GraphQL bilgisini yazdirir
    }

    // Tum butonların rengini ve simgesini pasif yapıyoruz
    private void butunButonlarPasifken() {
        for (JButton[] buttonRow : buttons) {//buttonRow , buttons matrisindeki satir sutunlari temsil eder
            for (JButton button : buttonRow) {
                button.setBackground(pasifRenk);//Her bir butonun arka plan rengi pasifRenk ile degistirilir.
                button.setIcon(pasifSimge);// Her bir butonun arka plan simgesi pasifSimge ile değiştirilir.
            }
        }
    }


    private void GraphqlMutasyonu(int row, int col) {//bu method bir mutasyon çalıştırıldığını ve hangi butonun tetiklendiğini belirtir.

        System.out.println("Mutation çalıştırıldı: Buton " + (row + 1) + "-" + (col + 1));
        // bir mutasyonun gerçekleştirildiğini ve hangi butonun etkilendiğini yazdirir
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ButtonKontrolBolgesi());//grafiksel kullanici arayuzunu baslattik
    }
}
