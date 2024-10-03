package practice.pack;

public class LongestArray {
    public static void main(String[] args) {

        String[] dizionario = {"canee", "pane", "citta", "elicottero", "palazzo","palalapalaplaplapla"};


        System.out.println(findLongest(dizionario));

    }

    public static int findLongest(String[] dizionario){
        int pos = 0;
        int max=dizionario[0].length();
        for (int i=0; i<dizionario.length; i++){
            if (dizionario[i].length() > max){
                max=dizionario[i].length();
                pos=i;
            }
        }
        return pos;
    }
    
}
