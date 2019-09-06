
//	def (list3, list4) = [[1,4,6,7] , [6,5,7,6]]

	def method(int choice)
	{	
		def list1  = [1,4,6,7]
	    def list2  = [6,5,7,6]

     int sum =0
     int mul =1
	 int result
		switch(choice)
		{
			case '0': 
			          for (nos in list1)
						  sum+=nos
						  result=sum
						  break;
						  
			case '1': 
			          for (nos in list2)
				          mul*=nos
						  result=mul
				          break;
						
	        default: println "wrong Input"
		}
		
		if(choice==0 || choice==1)
		{
		if (result>100)
			{list2+=list1
				println "$list2"
			}
			
		else  
			{list1+=list2	
                 println "$list1"
			}
    }
}

method(0)
method(1)
method(2)