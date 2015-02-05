
public class Door {
  
    public static boolean toggleDoor(boolean actual){
        return !actual;   
    }

    public static Boolean[] toggleDoorsEach(Boolean[] row, int number){
        int position = 0;
        while (position < row.length){
            row[position] = toggleDoor(row[position]);
            position = position + number;
        } 
        return row;  
    }

    public static Boolean[] toggleAndToggle(Boolean[] row){
        int longitud = row.length;
        for (int i=1;i<longitud;i++){
            row = toggleDoorsEach(row, i);
        }
        return row;
    } 
    
    public static void printArray(Boolean[] array){
       for (int i=0; i==array.length; i++){
           System.out.print(array[i]);
           System.out.print(", ");
       }
        System.out.println();
    }  
}