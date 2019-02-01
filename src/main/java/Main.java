import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Pupil> pupils = new ArrayList<Pupil>();

        pupils.add(new Pupil("Qurin", 4));
        pupils.add(new Pupil("Jonas", 2));
        pupils.add(new Pupil("Hansi", 6));
        pupils.add(new Pupil("Franzi", 3));
        pupils.add(new Pupil("Klausi", 1));
        pupils.add(new Pupil("Susi", 9));
        pupils.add(new Pupil("Ernst", 8));
        pupils.add(new Pupil("Maxi", 5));

        for (Pupil pupil : pupils) {
            System.out.println(pupil);
        }
    }
}