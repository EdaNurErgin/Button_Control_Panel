import javax.swing.*;

public class OzelButton extends JButton {//OzelButton,JButton'u miras alir

    private String graphqlBilgi; // GraphQL şemasına yazılacak bilgi

    public OzelButton(String text, String graphqlBilgi) {//OzelButton yapicisi
        super(text);
        this.graphqlBilgi = graphqlBilgi;
    }

    public String getGraphqlBilgi() {
        return graphqlBilgi;
    }//private tanimlanan graphqlBilgi degiskenini okunabilir yaptik

    public void setGraphqlBilgi(String graphqlBilgi) {
        this.graphqlBilgi = graphqlBilgi;
    }//private tanimlanan graphqlBilgi degiskenini deger atanabilir yaptik
}





