package LeetCodeJava;

class ZigZag {
	
	
	public static void main(String[] args) {
		System.out.println(convert("SANJETHAN", 7));
		//System.out.println(convert(convert("THALAPATHY", 4),4));
	}
	
	
	
	
	public static String deconvert(String s, int numRows) {
		return convert( s,  numRows);
	}
	
	
	
	
    public static String convert(String s, int numRows) {
        char[][] zigzag = new char[numRows][s.length()];
        		for(int i =0;i<numRows;i++) {
        			for(int j =0;j<s.length();j++) {
        				zigzag[i][j]='_';
        			}
        		}
        //String quadrillage="";		
        		
        int parcourChaine=0;
		String myName = "";

      	 //while(parcourChaine<s.length()){

        for(int j=0;j<s.length();j++){
        	
            for(int i=0;i<numRows;i++){
            		if(j%(numRows-1)==0&&parcourChaine<s.length()){ //si la colonne est un multiple de (numRows-1)
                    zigzag[i][j]=s.charAt(parcourChaine);
                    parcourChaine=(parcourChaine+1);
                    	//System.out.println(zigzag[i][j]+" i : "+i+" j : "+j);
                }
                else{
                    if((i+j)%(numRows-1)==0&&parcourChaine<s.length()){
                    	zigzag[i][j]=s.charAt(parcourChaine);
                        parcourChaine=(parcourChaine+1);
                    	//System.out.println(zigzag[i][j]+" i : "+i+" j : "+j);


                    }
                }
            //}

    }

        }
        int parcourchange=0;
       
        
        
       
        
        
        
        for(int i =0;i<numRows;i++){
            for(int j=0;j<s.length();j++){
                if(zigzag[i][j]!='_')
                	myName+=zigzag[i][j];
            	//System.out.println(zigzag[i][j]);
            	}
            		
            }    	
            
        
		return (myName);
      
        }
     
    }
