package Week09Methods;
import java.util.Scanner;
public class lameDb {
    public static String lameDb(String db, String op, String id, String data) {
        String tmp = "";
        int startIndex = 0;
        int endIndex = 0;
        int index = 0;
        int idIndex = 0;
        int counter = 1;

        if (op.equals("add")) {
            if (db.indexOf(id) != -1) {
                if (id.equals("1")) {
                    tmp = id + data + "#" + db.substring(db.indexOf(id), db.length());
                } else {
                    index = db.indexOf("#" + id);
                    tmp = db.substring(0, index) + "#" + id + data + db.substring(index, db.length());
                }

                //reorganizing numbers...
                while (idIndex != -1) {
                    idIndex = tmp.indexOf("#", idIndex);

                    if (idIndex != -1) {
                        counter++;
                        tmp = tmp.substring(0, idIndex + 1) +
                                Integer.toString(counter) +
                                tmp.substring(idIndex + 2);
                        idIndex += "#".length();
                    }
                }


            } else {
                tmp = db.concat("#" + id + data);
            }
        } else if (op.equals("edit")) {
            startIndex = db.indexOf(id, startIndex);
            tmp = db.replace(db.substring(startIndex, startIndex + (id + data).length()), id + data);
        } else if (op.equals("delete")) {
            if (id.equals("1")) {
                startIndex = db.indexOf(id, startIndex);
                endIndex = db.indexOf("#", startIndex + "#".length() + id.length());
            } else {
                startIndex = db.indexOf("#" + id, startIndex);
                endIndex = db.indexOf("#", startIndex + "#".length() + id.length());
            }

            tmp = db.replace(db.substring(startIndex, db.indexOf("#", endIndex)), "");
        }

        return tmp;
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
    }
}
