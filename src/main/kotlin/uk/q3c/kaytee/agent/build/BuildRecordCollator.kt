package uk.q3c.kaytee.agent.build

import uk.q3c.kaytee.agent.queue.AbstractBuildMessage
import java.util.*

/**
 * Created by David Sowerby on 25 Mar 2017
 */
interface BuildRecordCollator {
    val records: MutableMap<UUID, BuildRecord>
    fun getRecord(buildMessage: AbstractBuildMessage): BuildRecord
}