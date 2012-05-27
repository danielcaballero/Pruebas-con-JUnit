<table>
     <xsl:for-each select="./Properties/Property">
         <xsl:sort select="@name"/>
         <tr>
             <td><xsl:value-of select="@name"/></td>
             <td><xsl:value-of select="@value"/></td>
         </tr>
     </xsl:for-each>
</table>
