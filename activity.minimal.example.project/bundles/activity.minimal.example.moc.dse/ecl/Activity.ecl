import 'http://www.eclipse.org/emf/2002/Ecore'
import 'platform:/resource/activity.minimal.example/model/activity.ecore' 

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

package activity

	 --add DSE and MoCCML mapping here
	context Root
		def : startRoot : Event = self.main()
		inv startFirst : 
	 		let allStartActivities : Event = Expression Union(self.activities.startActivity) in
	 			Relation Precedes(self.startRoot, allStartActivities)
	 			
	context Activity
		def : startActivity : Event = self.startActivity()
		
-- How to escape Sequence? it does not seem that _'Sequence' works for context...
--	context Sequence
--		def : startSequence : Event = self.startSequence()		
		
 endpackage