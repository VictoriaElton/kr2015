import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Loader {
    private File fFilms=new File("fFilms.txt");
    private File fSerials=new File("fSerials.txt");

    public void uploadFilms (ArrayList<String> filmsArr) throws IOException {
        RandomAccessFile f=new RandomAccessFile("fFilms.txt","r");
        f.seek(0);

        while(f.getFilePointer()<f.length()) {
                filmsArr.add(f.readUTF());
        }

        f.close();
    }

    public void uploadSerials (ArrayList<String> serialsArr) throws IOException {
        RandomAccessFile f=new RandomAccessFile("fSerials.txt","r");
        f.seek(0);

        while(f.getFilePointer()<f.length()) {
            serialsArr.add(f.readUTF());
        }

        f.close();
    }

    public void uploadPast (ArrayList<String> pastArr) throws IOException {
        RandomAccessFile f=new RandomAccessFile("fPast.txt","r");
        f.seek(0);

        while(f.getFilePointer()<f.length()) {
            pastArr.add(f.readUTF());
        }

        f.close();
    }


    public void saveFilms(ArrayList<String> filmsArr) throws IOException {
        RandomAccessFile f=new RandomAccessFile("fFilms.txt","rw");
        f.setLength(0);
        f.seek(0);

        for (int i=0;i<filmsArr.size();i++){
            f.writeUTF(filmsArr.get(i));
        }
        f.close();
    }

    public void saveSerials(ArrayList<String> serialsArr) throws IOException {
        RandomAccessFile f=new RandomAccessFile("fSerials.txt","rw");
        f.setLength(0);
        f.seek(0);
        for (int i=0;i<serialsArr.size();i++){
            f.writeUTF(serialsArr.get(i));
        }
        f.close();
    }

    public void savePast(ArrayList<String> pastArr) throws IOException {
        RandomAccessFile f=new RandomAccessFile("fPast.txt","rw");
        f.setLength(0);
        f.seek(0);
        for (int i=0;i<pastArr.size();i++){
            f.writeUTF(pastArr.get(i));
        }
        f.close();
    }

}
