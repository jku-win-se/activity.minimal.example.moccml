package activity.minimal.example.activity.aspects;

import activity.minimal.example.activity.Sequence;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Sequence.class)
@SuppressWarnings("all")
public class SequenceAspect extends NamedElementAspect {
  public static void startSequence(final Sequence _self) {
    final activity.minimal.example.activity.aspects.SequenceAspectSequenceAspectProperties _self_ = activity.minimal.example.activity.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void startSequence()
    if (_self instanceof activity.minimal.example.activity.Sequence){
    	activity.minimal.example.activity.aspects.SequenceAspect._privk3_startSequence(_self_, (activity.minimal.example.activity.Sequence)_self);
    };
  }
  
  protected static void _privk3_startSequence(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self) {
    InputOutput.<String>println("Start Activity");
  }
}
