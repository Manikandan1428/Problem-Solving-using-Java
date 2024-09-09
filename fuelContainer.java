public class fuelContainer {
    public static void main(String[] args) {
        int n=2;
        int k=60;
        
        
        int count=0;
        int index[]=new int[n];
        int p[]={10,30};

        int v []={20,50};
        int sum=0;
        int pricesum =0;
        for (int i = 0; i < p.length; i++) {
            sum=sum+p[i];
        }
        
        int sum2=sum;
        
        int vol=0; 
        if(sum2<=k){
            for (int i = 0; i < v.length; i++) {
                vol=vol+v[i];   
            }
            System.out.println("Maximum Volume : "+vol);
            
        }
        else if(sum2>k){
            for (int i = 0; i < n; i++) {
                vol=0;
                sum=sum2;
                for (int j = 0; j < n; j++) {
                    if(j!=i){
                        if(sum>k){
                            sum=sum-p[j];
                            // System.out.println(sum);
                        }
                        
                        if(sum<=k){
                            // System.out.println("over");
                            if(j!=n-1){
                                // System.out.println("hi");
                                vol=vol+v[j+1];
                                // System.out.println(vol);
                                
                            }
                            
                        }
                       
                    } 
                }
                    index[pricesum]=vol;
                    pricesum++;
                
            }

           
                for (int j = 0; j < n; j++) {
                    if (j!=n-1){
                        index[j]=index[j]+v[j];
                    }
                        
                }
                
            // for (int i = 0; i < index.length; i++) {
            //     for (int j = 0; j < index.length; j++) {
            //         if (index[i]>index[j]) {
            //             count=index[i];
            //             index[i]=index[j];
            //             index[j]=count;
            //         }
            //     }
            // }
            
            // System.out.println("my index");
            // for (int i = 0; i < index.length; i++) {
            //     System.out.println(index[i]);
            // }

            int maxVol = index[0];
            for (int i = 0; i < index.length; i++) {
                if (index[i]>maxVol){
                    maxVol = index[i];
                }
            }

            System.out.println("Maximum Volume: "+maxVol);
            

    }


            
            // System.out.println(vol);
            
    

    }
}
