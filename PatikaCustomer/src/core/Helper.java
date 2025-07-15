package core;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Helper {

    public static void setTheme(){
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if(info.getName().equals("Nimbus")){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                        | UnsupportedLookAndFeelException e) {
                    
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    public static boolean isFieldEmpty(JTextField field){
        return field.getText().trim().isEmpty();
    }

    public static boolean isFieldEmpty(JTextField[] fields){
        for (JTextField field : fields){
            if (isFieldEmpty(field)) return true;
        }
        return false;
    }

    public static boolean isEmailValid(String mail){
        //@ olacak, @'ten önce bir değer, @'ten sonra bir nokta ve bir değer 
    
        if(mail == null || mail.trim().isEmpty()) return false;

        if(!mail.contains("@")) return false;

        String[] parts = mail.split("@");
        if(parts.length != 2) return false;

        if(parts[0].trim().isEmpty() || parts[1].trim().isEmpty()) return false;
    
        if (!parts[1].contains(".")) return false;

        return true;
    
    }

    public static void optionPaneDialogTr(){
        UIManager.put("OptionPane.okButtonText", "Tamam");
    }


    public static void showMsg(String message){
        String msg;
        String title;

        optionPaneDialogTr();
        switch (message) {
            case "fill":
                msg = "Lütfen tüm alanları doldurunuz!";
                title = "HATA";
                break;
            
            case "done":
                msg = "İşlem başarılı !";
                title = "Sonuç";
                break;
            case "error":
                msg = "Bir hata oluştu !";
                title = "HATA";
                break;

            default:
                msg = message;
                title = "Mesaj";
        }

        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
