//import scopes.PackagePrivateClass;

import scopes.PublicClass;
import scopes.VaryingScopeVariablesClass;

public class Scopes {
    public static void main(String[] args) {
        PublicClass publicClass;
        //PackagePrivateClass packagePrivateClass;
        VaryingScopeVariablesClass varyingScopeVariablesClass = new VaryingScopeVariablesClass();
        int publicInt = varyingScopeVariablesClass.publicInt;
        //int privateInt = varyingScopeVariablesClass.privateInt;
    }
}
