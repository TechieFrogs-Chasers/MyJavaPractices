package BasicsAssignment.NumberPrograms;

class DisplayAtoZ {
    public static void main(String[] args) {
        for(int i =0 ; i <= 65 ;i++)
           {
                System.out.print((char)(65+i)+ " ");
            }
            System.out.println();
        for(char alp = 'A' ; alp <= 'Z' ;alp++)
        {
             System.out.print(alp + " ");
         }
         System.out.println();
         for(char alph = 'a' ; alph <= 'z' ; alph++)
         {
              System.out.print(alph + " ");
          }
}
}