package activity.minimal.example.activity.aspects;

import activity.minimal.example.activity.Activity;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Activity.class)
@SuppressWarnings("all")
public class ActivityAspect extends NamedElementAspect {
  public static void startActivity(final Activity _self) {
    final activity.minimal.example.activity.aspects.ActivityAspectActivityAspectProperties _self_ = activity.minimal.example.activity.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void startActivity()
    if (_self instanceof activity.minimal.example.activity.Activity){
    	activity.minimal.example.activity.aspects.ActivityAspect._privk3_startActivity(_self_, (activity.minimal.example.activity.Activity)_self);
    };
  }
  
  protected static void _privk3_startActivity(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    InputOutput.<String>println("Start Activity");
  }
}
