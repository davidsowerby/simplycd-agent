package uk.q3c.simplycd.agent.build

import uk.q3c.build.gitplus.GitSHA
import uk.q3c.simplycd.agent.project.Project
import uk.q3c.simplycd.agent.queue.BuildRequest
import java.util.*

/**
 * Created by David Sowerby on 27 Jan 2017
 */
interface BuildRequestFactory {

    fun create(project: Project, gitSHA: GitSHA, uid: UUID): BuildRequest
}