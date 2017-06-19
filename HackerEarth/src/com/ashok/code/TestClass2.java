package com.ashok.code;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
public class TestClass2 {
	public static	int fa[] = new int[100005];
     public static  	int[] si = new int[100005];
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int t= Integer.parseInt(line);
        int ca;
        	StringBuffer bf = new StringBuffer();
        for(ca = 1;ca<=t;ca++)
        {
        	
        
       	line = br.readLine();
       	int n = Integer.parseInt(line);
       	int m;
       	line = br.readLine();
       	m = Integer.parseInt(line);
       
       	int i;
       	for(i=0;i<n;i++)
       	{
       		fa[i] = -1;
       		si[i] = 1;
       	}
       	for(i=0;i<m;i++)
       	{
       		line = br.readLine();
       		String[] my  =line.split(" ");
       		int x,y;
       		x = Integer.parseInt(my[0]);
       		y = Integer.parseInt(my[1]);
       			int u,v;
       			u = x;
       			v = y;
       		while(fa[x]!=-1)x = fa[x];
       		while(fa[y]!=-1)y = fa[y];
       	
    
       		int si1,si2;
       		if(x!=y)
       		{
       			si1 = fa[x];
       			si2 = fa[y];
       			if(si1 > si2)
       			{
       				si[x] +=si2;
       				fa[y] = x;
       				while(fa[u]!=-1){
       					v = fa[u];
       					fa[u] = x;
       					u = v;
       				}
       			}
       			else {
       				si[y] +=si1;
       				fa[x] = y;
       				u = v;
       					while(fa[u]!=-1){
       					v = fa[u];
       					fa[u] = x;
       					u = v;
       				}
       			}
       		}
       	}
       	int ans = 0;
       	for(i=0;i<n;i++)
       	if(fa[i]==-1)ans++;
       bf.append(ans+"\n");
        }
   System.out.println(bf.toString());
 
    }
}