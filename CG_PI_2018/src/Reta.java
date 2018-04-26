

public class Reta {

    public static void main(String args[]) throws Exception{
        
        String caminho = ImagemUtil.selecionarCaminhoDaImagem();
        
        int img[][] = ImagemUtil.abrirImagemTonsDeCinza(caminho);
        int imgRGB[][][] = ImagemUtil.abrirImagemColorida(caminho);
        
        
       // desenharReta(img, 50, 50, 200, 90, 255);        
        //desenharReta(img, 50, 50, 200, 10, 255);        
       // desenharReta(img, 200, 10, 200, 90, 255);        
        
       // desenharReta(imgRGB, 50, 50, 90, 100, 255, 0, 0);
      //  desenharReta(imgRGB, 50, 50, 10, 100, 255, 0, 0);
       // desenharReta(imgRGB, 10, 100, 90, 100, 255, 0, 0);
        
          //desenharReta(img, 50, 50, 200, 90, 255);        
        //desenharReta(img, 50, 50, 200, 10, 255);        
        //desenharReta(img, 200, 10, 200, 90, 255); 
        
        desenharReta(img, 208, 176, 208,258, 255);
        desenharReta(img, 208, 176, 314,172, 255);
        desenharReta(img, 314, 172, 314,258, 255);
        desenharReta(img, 208, 176, 269,86, 255);
        desenharReta(img, 269, 86, 313,173, 255);
        
        //desenharReta(imgRGB, 50, 50, 90, 100, 255, 0, 0);
        //desenharReta(imgRGB, 50, 50, 10, 100, 255, 0, 0);
        //desenharReta(imgRGB, 10, 100, 90, 100, 255, 0, 0);
        
        ImagemUtil.visualizarImagem(img, "desenhando reta");
        ImagemUtil.visualizarImagem(imgRGB, "desenhando reta");
    }
    
    //o ponto (x0, y0) precisa ser menor que o ponto (x1, y1)
    public static void desenharReta(int img[][], int x0, int y0, int x1, int y1, int cor){
        
        if(x0 > x1){
            int aux = x1;
            x1 = x0;
            x0 = aux;
            
            aux = y1;
            y1 = y0;
            y0 = aux;
        }
        
        int dx = x1 - x0;
        int dy = y1 - y0;
        
        double m =  dy / (double) dx;
        
        if(dx > dy){
            double y = y0;
            for(int x = x0; x <= x1; x++){
                y =  y + m ;
                img[x][(int)y] = cor; //desenhando a reta
                img[x+1][(int)y] = cor; //desenhando a reta+
                img[x-1][(int)y] = cor; //desenhando a reta
                img[x][(int)y+1] = cor; //desenhando a reta
                img[x][(int)y-1] = cor; //desenhando a reta
            } 
        }else{
            double x = x0;
            for(int y=y0; y <= y1; y++){
                x = x + 1/m;
                img[(int)x][y] = cor; //desenhando a reta
                img[(int)x+1][y] = cor; //desenhando a reta
                img[(int)x-1][y] = cor; //desenhando a reta
                img[(int)x][y+1] = cor; //desenhando a reta
                img[(int)x][y-1] = cor; //desenhando a reta
            }
        }
        
        
        
    }
    
    public static void desenharReta(int imgRGB[][][], int x0, int y0, int x1, int y1, int corR, int corG, int corB){
        
        int dx = x1 - x0;
        int dy = y1 - y0;
        
        double m =  dy / (double) dx;
        
        if(dx > dy){
            double y = y0;
            for(int x = x0; x <= x1; x++){
                y =  y + m ;
                imgRGB[x][(int)y][0] = corR; //desenhando a reta
                imgRGB[x][(int)y][1] = corG; //desenhando a reta
                imgRGB[x][(int)y][2] = corB; //desenhando a reta
            
                imgRGB[x+1][(int)y][0] = corR; //desenhando a reta
                imgRGB[x+1][(int)y][1] = corG; //desenhando a reta
                imgRGB[x+1][(int)y][2] = corB; //desenhando a reta

                imgRGB[x-1][(int)y][0] = corR; //desenhando a reta
                imgRGB[x-1][(int)y][1] = corG; //desenhando a reta
                imgRGB[x-1][(int)y][2] = corB; //desenhando a reta

                imgRGB[x][(int)y+1][0] = corR; //desenhando a reta
                imgRGB[x][(int)y+1][1] = corG; //desenhando a reta
                imgRGB[x][(int)y+1][2] = corB; //desenhando a reta

                imgRGB[x][(int)y-1][0] = corR; //desenhando a reta
                imgRGB[x][(int)y-1][1] = corG; //desenhando a reta
                imgRGB[x][(int)y-1][2] = corB; //desenhando a reta

            
            } 
            
        }else{
            double x = x0;
            for(int y=y0; y <= y1; y++){
                x = x + 1/m;
                imgRGB[(int)x][y][0] = corR; //desenhando a reta
                imgRGB[(int)x][y][1] = corG; //desenhando a reta
                imgRGB[(int)x][y][2] = corB; //desenhando a reta
                
                imgRGB[(int)x+1][y][0] = corR; //desenhando a reta
                imgRGB[(int)x+1][y][1] = corG; //desenhando a reta
                imgRGB[(int)x+1][y][2] = corB; //desenhando a reta
                
                imgRGB[(int)x-1][y][0] = corR; //desenhando a reta
                imgRGB[(int)x-1][y][1] = corG; //desenhando a reta
                imgRGB[(int)x-1][y][2] = corB; //desenhando a reta
                
                imgRGB[(int)x][y+1][0] = corR; //desenhando a reta
                imgRGB[(int)x][y+1][1] = corG; //desenhando a reta
                imgRGB[(int)x][y+1][2] = corB; //desenhando a reta
                
                imgRGB[(int)x][y-1][0] = corR; //desenhando a reta
                imgRGB[(int)x][y-1][1] = corG; //desenhando a reta
                imgRGB[(int)x][y-1][2] = corB; //desenhando a reta
            }
        }
        
        
        
    }
    
    
}
