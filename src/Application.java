import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Application {
    public ArrayList <String> filmsArr=new ArrayList<String>();
    public ArrayList <String> serialsArr=new ArrayList<String>();
    public ArrayList <String> pastArr=new ArrayList<String>();
    public ArrayList <String> graficArr=new ArrayList<String>();
    private Loader load = new Loader();

    public void addFilm(String name,String date){
        Date Current_Date = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
        format1.format(Current_Date);
        if (Integer.parseInt(format1.format(Current_Date).substring(6))>Integer.parseInt(date.substring(6))){
            pastArr.add(name+' '+date);
        }
        else
            if (Integer.parseInt(format1.format(Current_Date).substring(6))==Integer.parseInt(date.substring(6))){
                if (Integer.parseInt(format1.format(Current_Date).substring(3,4))>Integer.parseInt(date.substring(3,4))){
                    if (Integer.parseInt(format1.format(Current_Date).substring(0,1))>Integer.parseInt(date.substring(0,1))){
                        pastArr.add(name+' '+date);
                    }
                }
            }
            else
                filmsArr.add(name+' '+date);
    }

    public void addSerial(String name,String date){
        Date Current_Date = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
        format1.format(Current_Date);
        if (Integer.parseInt(format1.format(Current_Date).substring(6))>Integer.parseInt(date.substring(6))){
            pastArr.add(name+' '+date);
        }
        else
        if (Integer.parseInt(format1.format(Current_Date).substring(6))==Integer.parseInt(date.substring(6))){
            if (Integer.parseInt(format1.format(Current_Date).substring(3,4))>Integer.parseInt(date.substring(3,4))){
                if (Integer.parseInt(format1.format(Current_Date).substring(0,1))>Integer.parseInt(date.substring(0,1))){
                    pastArr.add(name+' '+date);
                }
            }
        }
        else
            serialsArr.add(name+' '+date);
    }

    public void uploadFilms() throws IOException {
        load.uploadFilms(filmsArr);
    }

    public void uploadSerials() throws IOException {
        load.uploadSerials(serialsArr);
    }

    public void saveFilms() throws IOException {
        load.saveFilms(filmsArr);
    }

    public void saveSerials() throws IOException {
        load.saveSerials(serialsArr);
    }

}
