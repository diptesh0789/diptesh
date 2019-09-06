package com.groovy_Lap_1

def mulAll(list)
{def multiplication = 1
	list.forEach
	{multiplication = multiplication * it
		
	}
	multiplication
}

def mul(list)
{def val= list.inject(1, {a,b -> a*b})
	println list
	println val
}

def (list1, list2) = [[1,4,6,7], [6,5,7,6]]

mul(list1)


//MAPS

def mapOfValues= [1: 'a', 2:'b', 3:'c']
def collectionOfValues = mapOfValues.collect{k,v -> "$k:$v"}
println collectionOfValues

def joinedCollectionOfValues