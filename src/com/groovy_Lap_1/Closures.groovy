doubleNum= {num -> num*2}
println doubleNum(3)

processThenPrint = {num, closure->
	            def value = closure(num)
				println value
                   }

processThenPrint(3, doubleNum)
processThenPrint(10, {it/3})