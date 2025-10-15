//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

  Phone phone=new Phone();
  phone.name="Aiphone";
  phone.model="15";
  phone.year=2025;
  phone.price=95000;
  phone.storage=512;
  phone.colour=" gray";
  phone.toTakeaPhoto();
          System.out.println(
                  "Name: "+ phone.name+"\n"+
                  "Model: "+phone.model+"\n"+
                  "Year: "+ phone.year+"\n"+
                  "Price: "+phone.price+"\n"+
                  "Storage: " +phone.storage+"\n"+
                  "Colour: " +phone.colour+"\n"
                );




    }


}