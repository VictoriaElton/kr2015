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

    public void createGrafic(){
        graficArr.clear();

        for (String str:filmsArr){
            graficArr.add(str);
        }

        for (String str:serialsArr){
            graficArr.add(str);
        }
    }

    public void sortGrafic(){
        for (int i=0;i<graficArr.size()-1;i++){
            for (int j=i+1;j<graficArr.size();j++){
                if(Integer.parseInt(graficArr.get(i).substring(graficArr.get(i).length()-4))>Integer.parseInt(graficArr.get(j).substring(graficArr.get(j).length()-4))){
                    String tmp=graficArr.get(i);
                    graficArr.set(i,graficArr.get(j));
                    graficArr.set(j,tmp);
                }
                else{
                    if (Integer.parseInt(graficArr.get(i).substring(graficArr.get(i).length()-4))==Integer.parseInt(graficArr.get(j).substring(graficArr.get(j).length()-4))){
                        int a=Integer.parseInt(graficArr.get(i).substring(graficArr.get(i).length() - 7, graficArr.get(i).length() - 5));
                        int b=Integer.parseInt(graficArr.get(j).substring(graficArr.get(j).length()-7,graficArr.get(j).length()-5));
                        if (a>b){
                           String tmp=graficArr.get(i);
                           graficArr.set(i,graficArr.get(j));
                           graficArr.set(j,tmp);
                       }
                        else {
                           if (Integer.parseInt(graficArr.get(i).substring(graficArr.get(i).length()-7,graficArr.get(i).length()-5))==Integer.parseInt(graficArr.get(j).substring(graficArr.get(j).length()-7,graficArr.get(j).length()-5))){
                               if (Integer.parseInt(graficArr.get(i).substring(graficArr.get(i).length()-10,graficArr.get(i).length()-8))>Integer.parseInt(graficArr.get(j).substring(graficArr.get(j).length()-10,graficArr.get(j).length()-8))){
                                   String tmp=graficArr.get(i);
                                   graficArr.set(i,graficArr.get(j));
                                   graficArr.set(j,tmp);
                               }
                           }
                       }
                    }
                }
            }
        }
    }

    public void uploadFilms() throws IOException {
        load.uploadFilms(filmsArr);
    }

    public void uploadSerials() throws IOException {
        load.uploadSerials(serialsArr);
    }

    public void uploadPast() throws IOException {
        load.uploadPast(pastArr);
    }


    public void saveFilms() throws IOException {
        load.saveFilms(filmsArr);
    }

    public void saveSerials() throws IOException {
        load.saveSerials(serialsArr);
    }

    public void savePast() throws IOException {
        load.savePast(pastArr);
    }
}
