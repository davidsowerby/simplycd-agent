package uk.q3c.kaytee.agent.i18n

import uk.q3c.kaytee.agent.i18n.BuildFailCauseKey.*
import uk.q3c.krail.i18n.EnumResourceBundle

/**
 * Created by David Sowerby on 09 Jan 2017
 */
class BuildFailCauses : EnumResourceBundle<BuildFailCauseKey>() {

    override fun loadMap() {
        put(Unsupported_Gradle_Version, "The target Gradle version does not support build execution")
        put(Unsupported_Operation_Configuration, "The target Gradle version does not support some requested configuration option such as 'withArguments(String...)'")
        put(Unsupported_Build_Argument, "There is a problem with build arguments provided by 'withArguments(String...)'")
        put(Build_Failed, "Executing the Gradle build has failed")
        put(Build_Cancelled, "The operation was cancelled before it completed successfully")
        put(Gradle_Connection_Failure, "The Gradle connection failed")
        put(Gradle_Illegal_State, "Operation attempted while the Gradle connection is closed or is closing")
        put(Unexpected_Exception_Type, "Build threw an unexpected exception type, please submit an issue")
        put(Preparation_Failure, "Failure occurred while preparing the build environment")
    }
}