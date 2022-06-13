package activity.minimal.example.activity.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import activity.minimal.example.activity.Root
import activity.minimal.example.activity.Activity
import activity.minimal.example.activity.Sequence
import activity.minimal.example.activity.NamedElement

import static extension activity.minimal.example.activity.aspects.RootAspect.*
import static extension activity.minimal.example.activity.aspects.ActivityAspect.*
import static extension activity.minimal.example.activity.aspects.SequenceAspect.*
import static extension activity.minimal.example.activity.aspects.NamedElementAspect.*

@Aspect(className=Root)
class RootAspect extends NamedElementAspect {
	
	def void main() {
		println("Start Root");
	}
}

@Aspect(className=Activity)
class ActivityAspect extends NamedElementAspect {
	
	def void startActivity() {
		println("Start Activity")
	}
}

@Aspect(className=Sequence)
class SequenceAspect extends NamedElementAspect {
	
	def void startSequence() {
		println("Start Activity")
	}
	
}

@Aspect(className=NamedElement)
abstract class NamedElementAspect {
	
}



