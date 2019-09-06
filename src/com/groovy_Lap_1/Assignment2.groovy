def mappings(def list)
{
 def designations= [
		 1: 'up',
		 2: 'up',
		 3: 'down',
		 4: 'up',
		 5: 'up',
		 6: 'down',
		 7: 'down',
		 8: 'up',
		 9: 'down',
		 0: 'down' ]
 
 int cup=0, cdown=0, cnone=0
 
 for(nos in list)
 {if (designations[nos]== 'up')
	    cup++
 else if (designations[nos]== 'down')
		cdown++
  else cnone++
 }
 
 println "There are $cup Numbers in Category UP, $cdown Numbers in Category DOWN and $cnone Numbers in Category NONE"
 }

 def list1= [2,6,5,10]
mappings(list1)



 catMap= [
		 1: 'up',
		 2: 'up',
		 3: 'down',
		 4: 'up',
		 5: 'up',
		 6: 'down',
		 7: 'down',
		 8: 'up',
		 9: 'down',
		 0: 'down' ]
 
 def segregateByCategories(testList)
 {catList = testList.collect{catMap[it]} // ["down", "up", "down", null, null]
	 catList.groupBy{it}.                // ["down": ["down", "down"], "up": ["up]]
	 collect{k,v -> ["$k": v.size()]}    // [up:2, down:1, null:1]
	 
 }
 
 def inputvals = [1,5,10]
 def returnval= segregateByCategories(inputvals)
 
 
 
