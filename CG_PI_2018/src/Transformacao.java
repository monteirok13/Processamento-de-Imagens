

public class Transformacao{

     public static void main(String args[]) throws Exception{

         int img[][] = new int[200][200];
         
         int x1 = 60;
         int y1 = 50;
         
         int x2 = 40;
         int y2 = 70;
         
         int x3 = 80;
         int y3 = 70;
         
         Reta.desenharReta(img, x1, y1, x3, y3, 255);        
         Reta.desenharReta(img, x1, y1, x2, y2, 255);         
         Reta.desenharReta(img, x2, y2, x3, y3, 255);         
         
         int x1Rot = getRotacaoX(x1, y1, 60, 60.3, 45);
         int y1Rot = getRotacaoY(x1, y1, 60, 60.3, 45);
         
         int x2Rot = getRotacaoX(x2, y2, 60, 60.3, 45);
         int y2Rot = getRotacaoY(x2, y2, 60, 60.3, 45);
         
         int x3Rot = getRotacaoX(x3, y3, 60, 60.3, 45);
         int y3Rot = getRotacaoY(x3, y3, 60, 60.3, 45);
         
         System.out.println(x1 + " => " + x1Rot);
         System.out.println(y1 + " => " + y1Rot);
         
         System.out.println(x2 + " => " + x2Rot);
         System.out.println(y2 + " => " + y2Rot);
         
         System.out.println(x3 + " => " + x3Rot);
         System.out.println(y3 + " => " + y3Rot);
         
         
         Reta.desenharReta(img, x1Rot, y1Rot, x2Rot, y2Rot, 128);        
         Reta.desenharReta(img, x1Rot, y1Rot, x3Rot, y3Rot, 128);         
         Reta.desenharReta(img, x2Rot, y2Rot, x3Rot, y3Rot, 128);         
         
         
         ImagemUtil.visualizarImagem(img, "Triangulo");
         
     }
     
     public static int getRotacaoY(int x, int y, double xmedio, double ymedio, double anguloGraus){
                     
          
          double matTrans1[][] = {
                                    {1,   0 ,  0},
                                    {0,   1 ,  0},
                                    {-xmedio, -ymedio, 1}
                                };
            
          int xPasso1 = getTransformacaoX(x, y, matTrans1);
          int yPasso1 = getTransformacaoY(x, y, matTrans1);
          
     	  double angulo = Math.toRadians(anguloGraus);
          double matRot[][] = { 
                            {Math.cos(angulo), Math.sin(angulo), 0},
                            {-Math.sin(angulo), Math.cos(angulo) , 0},
                            {0               , 0                , 1}
                           };
       
          int xPasso2 = getTransformacaoX(xPasso1, yPasso1, matRot);
          int yPasso2 = getTransformacaoY(xPasso1, yPasso1, matRot);
          
          
          double matTrans2[][] = {
                                  {1,   0 ,  0},
                                  {0,   1 ,  0},
                                  {xmedio, ymedio,   1}
                               };
          
          int xPasso3 = getTransformacaoX(xPasso2, yPasso2, matTrans2);
          int yPasso3 = getTransformacaoY(xPasso2, yPasso2, matTrans2);
          
          return yPasso3;
     }
     
     
     public static int getRotacaoX(int x, int y, double xmedio, double ymedio, double anguloGraus){
                     
          
          double matTrans1[][] = {
                                    {1,   0 ,  0},
                                    {0,   1 ,  0},
                                    {-xmedio, -ymedio, 1}
                                };
            
          int xPasso1 = getTransformacaoX(x, y, matTrans1);
          int yPasso1 = getTransformacaoY(x, y, matTrans1);
          
     	  double angulo = Math.toRadians(anguloGraus);
          double matRot[][] = { 
                            {Math.cos(angulo), Math.sin(angulo), 0},
                            {-Math.sin(angulo), Math.cos(angulo) , 0},
                            {0               , 0                , 1}
                           };
       
          int xPasso2 = getTransformacaoX(xPasso1, yPasso1, matRot);
          int yPasso2 = getTransformacaoY(xPasso1, yPasso1, matRot);
          
          
          double matTrans2[][] = {
                                  {1,   0 ,  0},
                                  {0,   1 ,  0},
                                  {xmedio, ymedio,   1}
                               };
          
          int xPasso3 = getTransformacaoX(xPasso2, yPasso2, matTrans2);
          int yPasso3 = getTransformacaoY(xPasso2, yPasso2, matTrans2);
          
          return xPasso3;
     }
     
     public static int getTransformacaoX(int x, int y, double mat[][]){
         return (int) (x * mat[0][0] + y * mat[1][0] + 1 * mat[2][0]);     
     }
     
    public static int getTransformacaoY(int x, int y, double mat[][]){
        return (int) (x * mat[0][1] + y * mat[1][1] + 1 * mat[2][1]);     
     }
     
}