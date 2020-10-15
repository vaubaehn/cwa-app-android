package de.rki.coronawarnapp.risk

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class RiskModule {

    @Binds
    @Singleton
    abstract fun bindRiskLevelCalculation(
        riskLevelCalculation: DefaultRiskLevels
    ): RiskLevels

    @Binds
    @Singleton
    abstract fun bindRiskScoreAnalysis(
        riskScoreAnalysis: DefaultRiskScoreAnalysis
    ): RiskScoreAnalysis
}
