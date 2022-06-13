package activity.minimal.example.activity.aspects;

import activity.minimal.example.activity.Root;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Root.class)
@SuppressWarnings("all")
public class RootAspect extends NamedElementAspect {
  public static void main(final Root _self) {
    final activity.minimal.example.activity.aspects.RootAspectRootAspectProperties _self_ = activity.minimal.example.activity.aspects.RootAspectRootAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof activity.minimal.example.activity.Root){
    	activity.minimal.example.activity.aspects.RootAspect._privk3_main(_self_, (activity.minimal.example.activity.Root)_self);
    };
  }
  
  protected static void _privk3_main(final RootAspectRootAspectProperties _self_, final Root _self) {
    InputOutput.<String>println("Start Root");
  }
}
