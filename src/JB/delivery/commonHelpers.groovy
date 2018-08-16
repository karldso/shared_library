package JB.delivery

import org.apache.commons.io.FilenameUtils;
import java.sql.Timestamp
import groovy.json.JsonOutput
import java.util.Optional
import hudson.tasks.test.AbstractTestResultAction
import hudson.plugins.checkstyle.CheckStyleResultAction
import hudson.plugins.clover.CloverBuildAction
import hudson.plugins.warnings.WarningsResultAction
import hudson.model.Actionable
import groovy.xml.XmlUtil
import groovy.json.JsonSlurper
import hudson.tasks.junit.CaseResult

@NonCPS
def getTextMessageParam(parameter_1, parameter_2)
{
    a1 = parameter_1.toUpperCase()
    a2 = parameter_2.toLowerCase()
    echo "Running parametrized method" 
    return "${a1} ${a2}"
} 

@NonCPS
def getTextMessage()
{
    a1 = "Thanks"
    a2 = "for your patience"
    return "${a1} ${a2}"
}
