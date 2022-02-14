class CopiaArquivo {
   public static void main (String[] args){
	  //aparentemente há erro na funcao Arq.
      Arq.openRead("Arquivos.txt");
	  //Arq.openRead("C:\\entrada01.txt");
	  //Arq.openRead("/home/lucasduarte/entrada01.txt");
	  //Arq.openRead(MyIO.readString("Digite o nome do arquivo: ";)
	  
      String str  = "";
      while (Arq.hasNext() == true){
         str += Arq.readChar();
      }
      /*
      String str  = "";
      while (Arq.hasNext() == true){
         str += Arq.readString();
      }
      String str  = "";
      while (Arq.hasNext() == true){
         str += Arq.readLine();
      }
      String str  = Arq.readAll();
      */
      
      Arq.close();

      Arq.openWrite("copia.txt");
      Arq.print(str);
      Arq.close();
   }
}
