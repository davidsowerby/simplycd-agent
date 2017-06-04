package uk.q3c.kaytee.agent.build

import uk.q3c.kaytee.plugin.GroupConfig
import uk.q3c.kaytee.plugin.KayTeeExtension

/**
 * Created by David Sowerby on 30 Jan 2017
 */
class BuildConfigurationRandomiser {

    KayTeeExtension config

    BuildConfigurationRandomiser() {
        this.config = new KayTeeExtension()
        Random random = new Random()
        configureTest(config.unitTest, random)
        configureTest(config.integrationTest, random)
        configureTest(config.functionalTest, random)
        configureTest(config.acceptanceTest, random)
        configureTest(config.productionTest, random)
    }

    def configureTest(GroupConfig config, Random random) {
        config.enabled = random.nextBoolean()
        if (config.enabled) {
            config.auto = true
//            config.auto = random.nextBoolean()
            config.qualityGate = random.nextBoolean()
            config.manual = false
//            config.manual = random.nextBoolean()
//            if (!(config.auto || config.manual)) {  // if both false, make it auto
//                config.auto = true
//            }
            boolean external = false
            String externalRepoUrl = ""
            String externalRepoTask = "test"
        }
    }
}