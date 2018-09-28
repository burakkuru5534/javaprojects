
public class Matriss {
public static void carpim(int[][] a,int[][] b){
int[][] c=new int[a.length][b[0].length];
for(int i=0;i<a.length;i++){
for(int j=0;j<b[0].length;j++){
for(int k=0;k<b.length;k++){
c[i][j]=c[i][j]+a[i][k]+b[k][j];
}
}
}
for(int i=0;i<c.length;i++){
for(int j=0;j<c[0].length;j++){
System.out. print(c[i][j]+" ");
}
System.out. println();
}
}
public static void main(String []args){
int[][] a=new int[][]{{4,2,3},{3,3,3},{5,6,2}};
int[][] b=new int[][]{{1,5,3},{2,9,6},{7,8,5}};
carpim(a,b); 
}
}