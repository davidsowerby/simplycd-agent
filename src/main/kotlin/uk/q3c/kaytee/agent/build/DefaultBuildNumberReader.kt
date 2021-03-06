package uk.q3c.kaytee.agent.build

import com.google.inject.Inject
import com.google.inject.Singleton

/**
 * Created by David Sowerby on 16 Jan 2017
 */
@Singleton
class DefaultBuildNumberReader @Inject constructor() : BuildNumberReader {

    override fun nextBuildNumber(build: Build): String {
        return build.gitHash.short()
    }
}