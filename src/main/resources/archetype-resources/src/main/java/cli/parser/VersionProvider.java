#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.cli.parser;

import static picocli.CommandLine.IVersionProvider;

public class VersionProvider implements IVersionProvider {

    @Override
    public String[] getVersion() {
        Package javaPackage = VersionProvider.class.getPackage();
        return new String[]{javaPackage.getImplementationTitle() + " v" + javaPackage.getImplementationVersion()};
    }
}
