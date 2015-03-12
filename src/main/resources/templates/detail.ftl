<#import "layouts/public.ftl" as p/>
<@p.publicTemplate title="Item Detail">
<div class="jumbotron">
    <h1>${item.name}</h1>
    <p>${item.description}</p>
</div>
</@p.publicTemplate>
